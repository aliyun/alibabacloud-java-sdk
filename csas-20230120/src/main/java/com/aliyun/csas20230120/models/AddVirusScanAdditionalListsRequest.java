// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class AddVirusScanAdditionalListsRequest extends TeaModel {
    /**
     * <p>The list of entries to add. The list must contain at least one entry.</p>
     */
    @NameInMap("AdditionalLists")
    public java.util.List<AddVirusScanAdditionalListsRequestAdditionalLists> additionalLists;

    /**
     * <p>The operating system type to which the list applies. Valid values:</p>
     * <ul>
     * <li><strong>windows</strong>: Windows.</li>
     * <li><strong>macOS</strong>: macOS.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>windows</p>
     */
    @NameInMap("DevType")
    public String devType;

    public static AddVirusScanAdditionalListsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddVirusScanAdditionalListsRequest self = new AddVirusScanAdditionalListsRequest();
        return TeaModel.build(map, self);
    }

    public AddVirusScanAdditionalListsRequest setAdditionalLists(java.util.List<AddVirusScanAdditionalListsRequestAdditionalLists> additionalLists) {
        this.additionalLists = additionalLists;
        return this;
    }
    public java.util.List<AddVirusScanAdditionalListsRequestAdditionalLists> getAdditionalLists() {
        return this.additionalLists;
    }

    public AddVirusScanAdditionalListsRequest setDevType(String devType) {
        this.devType = devType;
        return this;
    }
    public String getDevType() {
        return this.devType;
    }

    public static class AddVirusScanAdditionalListsRequestAdditionalLists extends TeaModel {
        /**
         * <p>The matching dimension of the list entry. Valid values:</p>
         * <ul>
         * <li><strong>FileSuffix</strong>: Matches by file name extension.</li>
         * <li><strong>FileName</strong>: Matches by file name.</li>
         * <li><strong>FolderName</strong>: Matches by folder name.</li>
         * <li><strong>FilePath</strong>: Matches by file path.</li>
         * <li><strong>FileMd5</strong>: Matches by file MD5 hash.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FileSuffix</p>
         */
        @NameInMap("AdditionalType")
        public String additionalType;

        /**
         * <p>The content of the list entry. The value can be up to 255 characters in length. The meaning of this parameter is determined by the AdditionalType parameter. If AdditionalType is set to FileSuffix, specify the file name extension. If AdditionalType is set to FileName, specify the file name. If AdditionalType is set to FolderName, specify the folder name. If AdditionalType is set to FilePath, specify the file path. If AdditionalType is set to FileMd5, specify the MD5 hash of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>.tmp</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The list type. Valid values:</p>
         * <ul>
         * <li><strong>Blacklist</strong>: Blacklist. Matched files are directly identified as virus files.</li>
         * <li><strong>Whitelist</strong>: Whitelist. Matched files are excluded from virus detection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Whitelist</p>
         */
        @NameInMap("ListType")
        public String listType;

        public static AddVirusScanAdditionalListsRequestAdditionalLists build(java.util.Map<String, ?> map) throws Exception {
            AddVirusScanAdditionalListsRequestAdditionalLists self = new AddVirusScanAdditionalListsRequestAdditionalLists();
            return TeaModel.build(map, self);
        }

        public AddVirusScanAdditionalListsRequestAdditionalLists setAdditionalType(String additionalType) {
            this.additionalType = additionalType;
            return this;
        }
        public String getAdditionalType() {
            return this.additionalType;
        }

        public AddVirusScanAdditionalListsRequestAdditionalLists setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public AddVirusScanAdditionalListsRequestAdditionalLists setListType(String listType) {
            this.listType = listType;
            return this;
        }
        public String getListType() {
            return this.listType;
        }

    }

}
