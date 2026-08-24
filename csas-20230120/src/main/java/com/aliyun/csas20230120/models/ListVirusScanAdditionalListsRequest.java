// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVirusScanAdditionalListsRequest extends TeaModel {
    @NameInMap("AdditionalTypes")
    public java.util.List<String> additionalTypes;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>windows</p>
     */
    @NameInMap("DevType")
    public String devType;

    /**
     * <strong>example:</strong>
     * <p>.tmp</p>
     */
    @NameInMap("ListDetail")
    public String listDetail;

    @NameInMap("ListIds")
    public java.util.List<String> listIds;

    /**
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
