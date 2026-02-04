// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210218.models;

import com.aliyun.tea.*;

public class GetStsTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CCF92035-6231-5ABB-930E-1E003C32****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StsTokenModel")
    public GetStsTokenResponseBodyStsTokenModel stsTokenModel;

    public static GetStsTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStsTokenResponseBody self = new GetStsTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStsTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStsTokenResponseBody setStsTokenModel(GetStsTokenResponseBodyStsTokenModel stsTokenModel) {
        this.stsTokenModel = stsTokenModel;
        return this;
    }
    public GetStsTokenResponseBodyStsTokenModel getStsTokenModel() {
        return this.stsTokenModel;
    }

    public static class GetStsTokenResponseBodyStsTokenModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>105552640689****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <strong>example:</strong>
         * <p>be4be09e-cd00-4b4c-add7-11b4d8****</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>sts****</p>
         */
        @NameInMap("StsToken")
        public String stsToken;

        /**
         * <strong>example:</strong>
         * <p>105552640689****</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        public static GetStsTokenResponseBodyStsTokenModel build(java.util.Map<String, ?> map) throws Exception {
            GetStsTokenResponseBodyStsTokenModel self = new GetStsTokenResponseBodyStsTokenModel();
            return TeaModel.build(map, self);
        }

        public GetStsTokenResponseBodyStsTokenModel setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public GetStsTokenResponseBodyStsTokenModel setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetStsTokenResponseBodyStsTokenModel setStsToken(String stsToken) {
            this.stsToken = stsToken;
            return this;
        }
        public String getStsToken() {
            return this.stsToken;
        }

        public GetStsTokenResponseBodyStsTokenModel setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
