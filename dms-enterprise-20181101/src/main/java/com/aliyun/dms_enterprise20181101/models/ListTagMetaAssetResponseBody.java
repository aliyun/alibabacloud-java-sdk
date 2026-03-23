// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTagMetaAssetResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListTagMetaAssetResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListTagMetaAssetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagMetaAssetResponseBody self = new ListTagMetaAssetResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagMetaAssetResponseBody setData(java.util.List<ListTagMetaAssetResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTagMetaAssetResponseBodyData> getData() {
        return this.data;
    }

    public ListTagMetaAssetResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTagMetaAssetResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTagMetaAssetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagMetaAssetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTagMetaAssetResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListTagMetaAssetResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;schemaName&quot;: &quot;test&quot;}</p>
         */
        @NameInMap("MetaEntityAttrs")
        public java.util.Map<String, ?> metaEntityAttrs;

        /**
         * <strong>example:</strong>
         * <p>META_DATABASE</p>
         */
        @NameInMap("MetaType")
        public String metaType;

        public static ListTagMetaAssetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTagMetaAssetResponseBodyData self = new ListTagMetaAssetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTagMetaAssetResponseBodyData setMetaEntityAttrs(java.util.Map<String, ?> metaEntityAttrs) {
            this.metaEntityAttrs = metaEntityAttrs;
            return this;
        }
        public java.util.Map<String, ?> getMetaEntityAttrs() {
            return this.metaEntityAttrs;
        }

        public ListTagMetaAssetResponseBodyData setMetaType(String metaType) {
            this.metaType = metaType;
            return this;
        }
        public String getMetaType() {
            return this.metaType;
        }

    }

}
