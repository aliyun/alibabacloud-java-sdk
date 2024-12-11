// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeCompactionServiceSwitchResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeCompactionServiceSwitchResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D761DA51-12F8-5457-AAA9-F52B9F436D2D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCompactionServiceSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCompactionServiceSwitchResponseBody self = new DescribeCompactionServiceSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCompactionServiceSwitchResponseBody setData(DescribeCompactionServiceSwitchResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCompactionServiceSwitchResponseBodyData getData() {
        return this.data;
    }

    public DescribeCompactionServiceSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCompactionServiceSwitchResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the remote build feature is enabled.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableCompactionService")
        public Boolean enableCompactionService;

        public static DescribeCompactionServiceSwitchResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCompactionServiceSwitchResponseBodyData self = new DescribeCompactionServiceSwitchResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCompactionServiceSwitchResponseBodyData setEnableCompactionService(Boolean enableCompactionService) {
            this.enableCompactionService = enableCompactionService;
            return this;
        }
        public Boolean getEnableCompactionService() {
            return this.enableCompactionService;
        }

    }

}
