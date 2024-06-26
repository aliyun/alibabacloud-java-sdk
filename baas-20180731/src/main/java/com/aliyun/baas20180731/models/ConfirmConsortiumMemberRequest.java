// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ConfirmConsortiumMemberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>consortium-aaaaaa-akpcsjjac2jd</p>
     */
    @NameInMap("ConsortiumId")
    public String consortiumId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Organization")
    public java.util.List<ConfirmConsortiumMemberRequestOrganization> organization;

    public static ConfirmConsortiumMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmConsortiumMemberRequest self = new ConfirmConsortiumMemberRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmConsortiumMemberRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public ConfirmConsortiumMemberRequest setOrganization(java.util.List<ConfirmConsortiumMemberRequestOrganization> organization) {
        this.organization = organization;
        return this;
    }
    public java.util.List<ConfirmConsortiumMemberRequestOrganization> getOrganization() {
        return this.organization;
    }

    public static class ConfirmConsortiumMemberRequestOrganization extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>peers-aaaaaa1-1oxw31d046jtl</p>
         */
        @NameInMap("Id")
        public String id;

        public static ConfirmConsortiumMemberRequestOrganization build(java.util.Map<String, ?> map) throws Exception {
            ConfirmConsortiumMemberRequestOrganization self = new ConfirmConsortiumMemberRequestOrganization();
            return TeaModel.build(map, self);
        }

        public ConfirmConsortiumMemberRequestOrganization setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
