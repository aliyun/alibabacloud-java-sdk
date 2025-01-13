// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetRelationProductListResponseBody extends TeaModel {
    @NameInMap("Extentions")
    public java.util.Map<String, ?> extentions;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0EC7*726E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<GetRelationProductListResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StatusCode")
    public Integer statusCode;

    public static GetRelationProductListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRelationProductListResponseBody self = new GetRelationProductListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRelationProductListResponseBody setExtentions(java.util.Map<String, ?> extentions) {
        this.extentions = extentions;
        return this;
    }
    public java.util.Map<String, ?> getExtentions() {
        return this.extentions;
    }

    public GetRelationProductListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRelationProductListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRelationProductListResponseBody setResult(java.util.List<GetRelationProductListResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetRelationProductListResponseBodyResult> getResult() {
        return this.result;
    }

    public GetRelationProductListResponseBody setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static class GetRelationProductListResponseBodyResult extends TeaModel {
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>jTOSl***l1odxImRw</p>
         */
        @NameInMap("Pk")
        public String pk;

        public static GetRelationProductListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetRelationProductListResponseBodyResult self = new GetRelationProductListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetRelationProductListResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRelationProductListResponseBodyResult setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

    }

}
