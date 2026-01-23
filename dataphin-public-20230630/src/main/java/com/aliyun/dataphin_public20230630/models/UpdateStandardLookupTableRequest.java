// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateStandardLookupTableRequest extends TeaModel {
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
    @NameInMap("UpdateCommand")
    public UpdateStandardLookupTableRequestUpdateCommand updateCommand;

    public static UpdateStandardLookupTableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStandardLookupTableRequest self = new UpdateStandardLookupTableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStandardLookupTableRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public UpdateStandardLookupTableRequest setUpdateCommand(UpdateStandardLookupTableRequestUpdateCommand updateCommand) {
        this.updateCommand = updateCommand;
        return this;
    }
    public UpdateStandardLookupTableRequestUpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static class UpdateStandardLookupTableRequestUpdateCommandDirectoryReference extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/dir1/dir2</p>
         */
        @NameInMap("Directory")
        public String directory;

        public static UpdateStandardLookupTableRequestUpdateCommandDirectoryReference build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardLookupTableRequestUpdateCommandDirectoryReference self = new UpdateStandardLookupTableRequestUpdateCommandDirectoryReference();
            return TeaModel.build(map, self);
        }

        public UpdateStandardLookupTableRequestUpdateCommandDirectoryReference setDirectory(String directory) {
            this.directory = directory;
            return this;
        }
        public String getDirectory() {
            return this.directory;
        }

    }

    public static class UpdateStandardLookupTableRequestUpdateCommandLookupTableValueList extends TeaModel {
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

        public static UpdateStandardLookupTableRequestUpdateCommandLookupTableValueList build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardLookupTableRequestUpdateCommandLookupTableValueList self = new UpdateStandardLookupTableRequestUpdateCommandLookupTableValueList();
            return TeaModel.build(map, self);
        }

        public UpdateStandardLookupTableRequestUpdateCommandLookupTableValueList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateStandardLookupTableRequestUpdateCommandLookupTableValueList setEnglishName(String englishName) {
            this.englishName = englishName;
            return this;
        }
        public String getEnglishName() {
            return this.englishName;
        }

        public UpdateStandardLookupTableRequestUpdateCommandLookupTableValueList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateStandardLookupTableRequestUpdateCommandLookupTableValueList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateStandardLookupTableRequestUpdateCommand extends TeaModel {
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
        public UpdateStandardLookupTableRequestUpdateCommandDirectoryReference directoryReference;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("LookupTableValueList")
        public java.util.List<UpdateStandardLookupTableRequestUpdateCommandLookupTableValueList> lookupTableValueList;

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

        public static UpdateStandardLookupTableRequestUpdateCommand build(java.util.Map<String, ?> map) throws Exception {
            UpdateStandardLookupTableRequestUpdateCommand self = new UpdateStandardLookupTableRequestUpdateCommand();
            return TeaModel.build(map, self);
        }

        public UpdateStandardLookupTableRequestUpdateCommand setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateStandardLookupTableRequestUpdateCommand setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateStandardLookupTableRequestUpdateCommand setDirectoryReference(UpdateStandardLookupTableRequestUpdateCommandDirectoryReference directoryReference) {
            this.directoryReference = directoryReference;
            return this;
        }
        public UpdateStandardLookupTableRequestUpdateCommandDirectoryReference getDirectoryReference() {
            return this.directoryReference;
        }

        public UpdateStandardLookupTableRequestUpdateCommand setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateStandardLookupTableRequestUpdateCommand setLookupTableValueList(java.util.List<UpdateStandardLookupTableRequestUpdateCommandLookupTableValueList> lookupTableValueList) {
            this.lookupTableValueList = lookupTableValueList;
            return this;
        }
        public java.util.List<UpdateStandardLookupTableRequestUpdateCommandLookupTableValueList> getLookupTableValueList() {
            return this.lookupTableValueList;
        }

        public UpdateStandardLookupTableRequestUpdateCommand setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateStandardLookupTableRequestUpdateCommand setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

    }

}
