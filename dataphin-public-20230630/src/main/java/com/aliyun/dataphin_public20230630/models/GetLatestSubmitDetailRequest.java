// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetLatestSubmitDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubmitDetailQuery")
    public GetLatestSubmitDetailRequestSubmitDetailQuery submitDetailQuery;

    public static GetLatestSubmitDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLatestSubmitDetailRequest self = new GetLatestSubmitDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetLatestSubmitDetailRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetLatestSubmitDetailRequest setSubmitDetailQuery(GetLatestSubmitDetailRequestSubmitDetailQuery submitDetailQuery) {
        this.submitDetailQuery = submitDetailQuery;
        return this;
    }
    public GetLatestSubmitDetailRequestSubmitDetailQuery getSubmitDetailQuery() {
        return this.submitDetailQuery;
    }

    public static class GetLatestSubmitDetailRequestSubmitDetailQuery extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("ObjectId")
        public String objectId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MAX_COMPUTE_SQL</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        public static GetLatestSubmitDetailRequestSubmitDetailQuery build(java.util.Map<String, ?> map) throws Exception {
            GetLatestSubmitDetailRequestSubmitDetailQuery self = new GetLatestSubmitDetailRequestSubmitDetailQuery();
            return TeaModel.build(map, self);
        }

        public GetLatestSubmitDetailRequestSubmitDetailQuery setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public GetLatestSubmitDetailRequestSubmitDetailQuery setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

}
