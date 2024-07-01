// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class RenameSparkTemplateFileResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public RenameSparkTemplateFileResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16D332C4-ACEB-526A-9B53-2B708FED594A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RenameSparkTemplateFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenameSparkTemplateFileResponseBody self = new RenameSparkTemplateFileResponseBody();
        return TeaModel.build(map, self);
    }

    public RenameSparkTemplateFileResponseBody setData(RenameSparkTemplateFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RenameSparkTemplateFileResponseBodyData getData() {
        return this.data;
    }

    public RenameSparkTemplateFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RenameSparkTemplateFileResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>True</li>
         * <li>False</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Succeeded")
        public Boolean succeeded;

        public static RenameSparkTemplateFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RenameSparkTemplateFileResponseBodyData self = new RenameSparkTemplateFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RenameSparkTemplateFileResponseBodyData setSucceeded(Boolean succeeded) {
            this.succeeded = succeeded;
            return this;
        }
        public Boolean getSucceeded() {
            return this.succeeded;
        }

    }

}
