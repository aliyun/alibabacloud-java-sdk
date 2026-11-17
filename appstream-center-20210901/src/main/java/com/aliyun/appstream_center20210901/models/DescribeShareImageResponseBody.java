// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DescribeShareImageResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Image.NotExist</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response object.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Data")
    public DescribeShareImageResponseBodyData data;

    /**
     * <p>The message returned by the request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01A0C2ED-95F2-1A37-9FC6-4A395179****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeShareImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeShareImageResponseBody self = new DescribeShareImageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeShareImageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeShareImageResponseBody setData(DescribeShareImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeShareImageResponseBodyData getData() {
        return this.data;
    }

    public DescribeShareImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeShareImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeShareImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeShareImageResponseBodyData extends TeaModel {
        /**
         * <p>The list of Alibaba Cloud account IDs with which the image is shared.</p>
         */
        @NameInMap("AliUidList")
        public java.util.List<Long> aliUidList;

        public static DescribeShareImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeShareImageResponseBodyData self = new DescribeShareImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeShareImageResponseBodyData setAliUidList(java.util.List<Long> aliUidList) {
            this.aliUidList = aliUidList;
            return this;
        }
        public java.util.List<Long> getAliUidList() {
            return this.aliUidList;
        }

    }

}
