// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateFabricConsortiumMemberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

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
    public java.util.List<CreateFabricConsortiumMemberRequestOrganization> organization;

    public static CreateFabricConsortiumMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFabricConsortiumMemberRequest self = new CreateFabricConsortiumMemberRequest();
        return TeaModel.build(map, self);
    }

    public CreateFabricConsortiumMemberRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateFabricConsortiumMemberRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public CreateFabricConsortiumMemberRequest setOrganization(java.util.List<CreateFabricConsortiumMemberRequestOrganization> organization) {
        this.organization = organization;
        return this;
    }
    public java.util.List<CreateFabricConsortiumMemberRequestOrganization> getOrganization() {
        return this.organization;
    }

    public static class CreateFabricConsortiumMemberRequestOrganization extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>peers-aaaaaa1-1oxw31d046jtl</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static CreateFabricConsortiumMemberRequestOrganization build(java.util.Map<String, ?> map) throws Exception {
            CreateFabricConsortiumMemberRequestOrganization self = new CreateFabricConsortiumMemberRequestOrganization();
            return TeaModel.build(map, self);
        }

        public CreateFabricConsortiumMemberRequestOrganization setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
