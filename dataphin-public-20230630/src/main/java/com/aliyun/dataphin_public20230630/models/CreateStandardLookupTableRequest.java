// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateStandardLookupTableRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateCommand")
    public CreateStandardLookupTableRequestCreateCommand createCommand;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static CreateStandardLookupTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStandardLookupTableRequest self = new CreateStandardLookupTableRequest();
        return TeaModel.build(map, self);
    }

    public CreateStandardLookupTableRequest setCreateCommand(CreateStandardLookupTableRequestCreateCommand createCommand) {
        this.createCommand = createCommand;
        return this;
    }
    public CreateStandardLookupTableRequestCreateCommand getCreateCommand() {
        return this.createCommand;
    }

    public CreateStandardLookupTableRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class CreateStandardLookupTableRequestCreateCommandDirectoryReference extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/dir1/dir2</p>
         */
        @NameInMap("Directory")
        public String directory;

        public static CreateStandardLookupTableRequestCreateCommandDirectoryReference build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardLookupTableRequestCreateCommandDirectoryReference self = new CreateStandardLookupTableRequestCreateCommandDirectoryReference();
            return TeaModel.build(map, self);
        }

        public CreateStandardLookupTableRequestCreateCommandDirectoryReference setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

    }

    public static class CreateStandardLookupTableRequestCreateCommandLookupTableValueList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>HZ</p>
         */
        @NameInMap("EnglishName")
        public String englishName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>杭州</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateStandardLookupTableRequestCreateCommandLookupTableValueList build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardLookupTableRequestCreateCommandLookupTableValueList self = new CreateStandardLookupTableRequestCreateCommandLookupTableValueList();
            return TeaModel.build(map, self);
        }

        public CreateStandardLookupTableRequestCreateCommandLookupTableValueList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateStandardLookupTableRequestCreateCommandLookupTableValueList setEnglishName(String englishName) {
            this.englishName = englishName;
            return this;
        }
        public String getEnglishName() {
            return this.englishName;
        }

        public CreateStandardLookupTableRequestCreateCommandLookupTableValueList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateStandardLookupTableRequestCreateCommandLookupTableValueList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateStandardLookupTableRequestCreateCommand extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CITY</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("DirectoryReference")
        public CreateStandardLookupTableRequestCreateCommandDirectoryReference directoryReference;

        @NameInMap("LookupTableValueList")
        public java.util.List<CreateStandardLookupTableRequestCreateCommandLookupTableValueList> lookupTableValueList;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>城市码表</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>30012021</p>
         */
        @NameInMap("Owner")
        public String owner;

        public static CreateStandardLookupTableRequestCreateCommand build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardLookupTableRequestCreateCommand self = new CreateStandardLookupTableRequestCreateCommand();
            return TeaModel.build(map, self);
        }

        public CreateStandardLookupTableRequestCreateCommand setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateStandardLookupTableRequestCreateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateStandardLookupTableRequestCreateCommand setDirectoryReference(CreateStandardLookupTableRequestCreateCommandDirectoryReference directoryReference) {
            this.directoryReference = directoryReference;
            return this;
        }
        public CreateStandardLookupTableRequestCreateCommandDirectoryReference getDirectoryReference() {
            return this.directoryReference;
        }

        public CreateStandardLookupTableRequestCreateCommand setLookupTableValueList(java.util.List<CreateStandardLookupTableRequestCreateCommandLookupTableValueList> lookupTableValueList) {
            this.lookupTableValueList = lookupTableValueList;
            return this;
        }
        public java.util.List<CreateStandardLookupTableRequestCreateCommandLookupTableValueList> getLookupTableValueList() {
            return this.lookupTableValueList;
        }

        public CreateStandardLookupTableRequestCreateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateStandardLookupTableRequestCreateCommand setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

    }

}
