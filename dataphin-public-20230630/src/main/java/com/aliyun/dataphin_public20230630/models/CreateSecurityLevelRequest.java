// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateSecurityLevelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateSecurityLevelRequestCreateCommand createCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateSecurityLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityLevelRequest self = new CreateSecurityLevelRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecurityLevelRequest setCreateCommand(CreateSecurityLevelRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateSecurityLevelRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateSecurityLevelRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateSecurityLevelRequestCreateCommand extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Abbreviation")
        public String abbreviation;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateSecurityLevelRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateSecurityLevelRequestCreateCommand self = new CreateSecurityLevelRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateSecurityLevelRequestCreateCommand setAbbreviation(String abbreviation) {
            this.abbreviation = abbreviation;
            return this;
        }
        public String getAbbreviation() {
            return this.abbreviation;
        }

        public CreateSecurityLevelRequestCreateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateSecurityLevelRequestCreateCommand setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public CreateSecurityLevelRequestCreateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
