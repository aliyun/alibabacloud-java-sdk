// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVirusScanAdditionalListsRequest extends TeaModel {
    /**
     * <p>Filters by matching dimension. Duplicate values are not allowed. If this parameter is not specified, all matching dimensions are returned.</p>
     */
    @NameInMap("AdditionalTypes")
    public java.util.List<String> additionalTypes;

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

    /**
     * <p>The content of the list entry, using exact match. This parameter is used to locate a specific list entry by content and does not support fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>.tmp</p>
     */
    @NameInMap("ListDetail")
    public String listDetail;

    /**
     * <p>Filters by list entry ID. Duplicate values are not allowed. If this parameter is not specified, no filtering by list entry ID is applied.</p>
     */
    @NameInMap("ListIds")
    public java.util.List<String> listIds;

    /**
     * <p>Filters by list type. If this parameter is not specified, both blacklists and whitelists are returned. Valid values:</p>
     * <ul>
     * <li><strong>Blacklist</strong>: Blacklist. Files that match are directly identified as virus files.</li>
     * <li><strong>Whitelist</strong>: Whitelist. Files that match are excluded from virus detection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Whitelist</p>
     */
    @NameInMap("ListType")
    public String listType;

    public static ListVirusScanAdditionalListsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanAdditionalListsRequest self = new ListVirusScanAdditionalListsRequest();
        return TeaModel.build(map, self);
    }

    public ListVirusScanAdditionalListsRequest setAdditionalTypes(java.util.List<String> additionalTypes) {
        this.additionalTypes = additionalTypes;
        return this;
    }
    public java.util.List<String> getAdditionalTypes() {
        return this.additionalTypes;
    }

    public ListVirusScanAdditionalListsRequest setDevType(String devType) {
        this.devType = devType;
        return this;
    }
    public String getDevType() {
        return this.devType;
    }

    public ListVirusScanAdditionalListsRequest setListDetail(String listDetail) {
        this.listDetail = listDetail;
        return this;
    }
    public String getListDetail() {
        return this.listDetail;
    }

    public ListVirusScanAdditionalListsRequest setListIds(java.util.List<String> listIds) {
        this.listIds = listIds;
        return this;
    }
    public java.util.List<String> getListIds() {
        return this.listIds;
    }

    public ListVirusScanAdditionalListsRequest setListType(String listType) {
        this.listType = listType;
        return this;
    }
    public String getListType() {
        return this.listType;
    }

}
