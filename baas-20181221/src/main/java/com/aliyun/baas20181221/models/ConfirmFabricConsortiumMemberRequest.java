// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ConfirmFabricConsortiumMemberRequest extends TeaModel {
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
    public java.util.List<ConfirmFabricConsortiumMemberRequestOrganization> organization;

    public static ConfirmFabricConsortiumMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmFabricConsortiumMemberRequest self = new ConfirmFabricConsortiumMemberRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmFabricConsortiumMemberRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public ConfirmFabricConsortiumMemberRequest setOrganization(java.util.List<ConfirmFabricConsortiumMemberRequestOrganization> organization) {
        this.organization = organization;
        return this;
    }
    public java.util.List<ConfirmFabricConsortiumMemberRequestOrganization> getOrganization() {
        return this.organization;
    }

    public static class ConfirmFabricConsortiumMemberRequestOrganization extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>peers-aaaaaa1-1oxw31d046jtl</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static ConfirmFabricConsortiumMemberRequestOrganization build(java.util.Map<String, ?> map) throws Exception {
            ConfirmFabricConsortiumMemberRequestOrganization self = new ConfirmFabricConsortiumMemberRequestOrganization();
            return TeaModel.build(map, self);
        }

        public ConfirmFabricConsortiumMemberRequestOrganization setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
