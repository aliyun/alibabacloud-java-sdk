// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class UpdateAnycastEipAddressAssociationsRequest extends TeaModel {
    @NameInMap("AnycastId")
    public String anycastId;

    // 关联模式，默认模式、普通模式Default/Normal
    @NameInMap("AssociationMode")
    public String associationMode;

    @NameInMap("BindInstanceId")
    public String bindInstanceId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    // 新增关联的pop location
    @NameInMap("PopLocationAddList")
    public java.util.List<UpdateAnycastEipAddressAssociationsRequestPopLocationAddList> popLocationAddList;

    // 待删除的关联pop location
    @NameInMap("PopLocationDeleteList")
    public java.util.List<UpdateAnycastEipAddressAssociationsRequestPopLocationDeleteList> popLocationDeleteList;

    public static UpdateAnycastEipAddressAssociationsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAnycastEipAddressAssociationsRequest self = new UpdateAnycastEipAddressAssociationsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAnycastEipAddressAssociationsRequest setAnycastId(String anycastId) {
        this.anycastId = anycastId;
        return this;
    }
    public String getAnycastId() {
        return this.anycastId;
    }

    public UpdateAnycastEipAddressAssociationsRequest setAssociationMode(String associationMode) {
        this.associationMode = associationMode;
        return this;
    }
    public String getAssociationMode() {
        return this.associationMode;
    }

    public UpdateAnycastEipAddressAssociationsRequest setBindInstanceId(String bindInstanceId) {
        this.bindInstanceId = bindInstanceId;
        return this;
    }
    public String getBindInstanceId() {
        return this.bindInstanceId;
    }

    public UpdateAnycastEipAddressAssociationsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAnycastEipAddressAssociationsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateAnycastEipAddressAssociationsRequest setPopLocationAddList(java.util.List<UpdateAnycastEipAddressAssociationsRequestPopLocationAddList> popLocationAddList) {
        this.popLocationAddList = popLocationAddList;
        return this;
    }
    public java.util.List<UpdateAnycastEipAddressAssociationsRequestPopLocationAddList> getPopLocationAddList() {
        return this.popLocationAddList;
    }

    public UpdateAnycastEipAddressAssociationsRequest setPopLocationDeleteList(java.util.List<UpdateAnycastEipAddressAssociationsRequestPopLocationDeleteList> popLocationDeleteList) {
        this.popLocationDeleteList = popLocationDeleteList;
        return this;
    }
    public java.util.List<UpdateAnycastEipAddressAssociationsRequestPopLocationDeleteList> getPopLocationDeleteList() {
        return this.popLocationDeleteList;
    }

    public static class UpdateAnycastEipAddressAssociationsRequestPopLocationAddList extends TeaModel {
        // pop location
        @NameInMap("PopLocation")
        public String popLocation;

        public static UpdateAnycastEipAddressAssociationsRequestPopLocationAddList build(java.util.Map<String, ?> map) throws Exception {
            UpdateAnycastEipAddressAssociationsRequestPopLocationAddList self = new UpdateAnycastEipAddressAssociationsRequestPopLocationAddList();
            return TeaModel.build(map, self);
        }

        public UpdateAnycastEipAddressAssociationsRequestPopLocationAddList setPopLocation(String popLocation) {
            this.popLocation = popLocation;
            return this;
        }
        public String getPopLocation() {
            return this.popLocation;
        }

    }

    public static class UpdateAnycastEipAddressAssociationsRequestPopLocationDeleteList extends TeaModel {
        // pop location
        @NameInMap("PopLocation")
        public String popLocation;

        public static UpdateAnycastEipAddressAssociationsRequestPopLocationDeleteList build(java.util.Map<String, ?> map) throws Exception {
            UpdateAnycastEipAddressAssociationsRequestPopLocationDeleteList self = new UpdateAnycastEipAddressAssociationsRequestPopLocationDeleteList();
            return TeaModel.build(map, self);
        }

        public UpdateAnycastEipAddressAssociationsRequestPopLocationDeleteList setPopLocation(String popLocation) {
            this.popLocation = popLocation;
            return this;
        }
        public String getPopLocation() {
            return this.popLocation;
        }

    }

}
