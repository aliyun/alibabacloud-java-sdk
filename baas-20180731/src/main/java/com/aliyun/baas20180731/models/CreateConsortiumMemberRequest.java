// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateConsortiumMemberRequest extends TeaModel {
    /**
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
    public java.util.List<CreateConsortiumMemberRequestOrganization> organization;

    public static CreateConsortiumMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsortiumMemberRequest self = new CreateConsortiumMemberRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsortiumMemberRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateConsortiumMemberRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public CreateConsortiumMemberRequest setOrganization(java.util.List<CreateConsortiumMemberRequestOrganization> organization) {
        this.organization = organization;
        return this;
    }
    public java.util.List<CreateConsortiumMemberRequestOrganization> getOrganization() {
        return this.organization;
    }

    public static class CreateConsortiumMemberRequestOrganization extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>peers-aaaaaa1-1oxw31d046jtl</p>
         */
        @NameInMap("Id")
        public String id;

        public static CreateConsortiumMemberRequestOrganization build(java.util.Map<String, ?> map) throws Exception {
            CreateConsortiumMemberRequestOrganization self = new CreateConsortiumMemberRequestOrganization();
            return TeaModel.build(map, self);
        }

        public CreateConsortiumMemberRequestOrganization setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
