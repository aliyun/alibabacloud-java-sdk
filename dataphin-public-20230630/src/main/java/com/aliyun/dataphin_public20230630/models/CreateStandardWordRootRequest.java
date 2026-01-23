// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateStandardWordRootRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateStandardWordRootRequestCreateCommand createCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateStandardWordRootRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStandardWordRootRequest self = new CreateStandardWordRootRequest();
        return TeaModel.build(map, self);
    }

    public CreateStandardWordRootRequest setCreateCommand(CreateStandardWordRootRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateStandardWordRootRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateStandardWordRootRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateStandardWordRootRequestCreateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>avg</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>average</p>
         */
        @NameInMap("FullName")
        public String fullName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>平均值</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateStandardWordRootRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardWordRootRequestCreateCommand self = new CreateStandardWordRootRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateStandardWordRootRequestCreateCommand setAbbreviation(String abbreviation) {
            this.abbreviation = abbreviation;
            return this;
        }
        public String getAbbreviation() {
            return this.abbreviation;
        }

        public CreateStandardWordRootRequestCreateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateStandardWordRootRequestCreateCommand setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public CreateStandardWordRootRequestCreateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
