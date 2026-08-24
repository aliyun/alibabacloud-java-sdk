// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class AddVirusScanAdditionalListsRequest extends TeaModel {
    /**
     * <p>The list of entries to append. At least one entry is required.</p>
     */
    @NameInMap("AdditionalLists")
    public java.util.List<AddVirusScanAdditionalListsRequestAdditionalLists> additionalLists;

    /**
     * <p>The operating system type for which the list takes effect. Valid values:</p>
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
         * <li><strong>FileSuffix</strong>: matches by file name extension.</li>
         * <li><strong>FileName</strong>: matches by file name.</li>
         * <li><strong>FolderName</strong>: matches by folder name.</li>
         * <li><strong>FilePath</strong>: matches by file path.</li>
         * <li><strong>FileMd5</strong>: matches by file MD5 value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FileSuffix</p>
         */
        @NameInMap("AdditionalType")
        public String additionalType;

        /**
         * <p>The content of the list entry. The value cannot exceed 255 characters. The meaning is determined by AdditionalType: when AdditionalType is set to FileSuffix, specify a file name extension. When set to FileName, specify a file name. When set to FolderName, specify a folder name. When set to FilePath, specify a file path. When set to FileMd5, specify the MD5 value of a file.</p>
         * 
         * <strong>example:</strong>
         * <p>.tmp</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The list type. Valid values:</p>
         * <ul>
         * <li><strong>Blacklist</strong>: blacklist. Files that match are directly identified as virus files.</li>
         * <li><strong>Whitelist</strong>: whitelist. Files that match are excluded from virus detection.</li>
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
