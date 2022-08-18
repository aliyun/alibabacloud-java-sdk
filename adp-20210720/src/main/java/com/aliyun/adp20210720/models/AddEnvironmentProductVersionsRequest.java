// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class AddEnvironmentProductVersionsRequest extends TeaModel {
    @NameInMap("productVersionInfoList")
    public java.util.List<AddEnvironmentProductVersionsRequestProductVersionInfoList> productVersionInfoList;

    @NameInMap("productVersionUIDList")
    public java.util.List<String> productVersionUIDList;

    public static AddEnvironmentProductVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEnvironmentProductVersionsRequest self = new AddEnvironmentProductVersionsRequest();
        return TeaModel.build(map, self);
    }

    public AddEnvironmentProductVersionsRequest setProductVersionInfoList(java.util.List<AddEnvironmentProductVersionsRequestProductVersionInfoList> productVersionInfoList) {
        this.productVersionInfoList = productVersionInfoList;
        return this;
    }
    public java.util.List<AddEnvironmentProductVersionsRequestProductVersionInfoList> getProductVersionInfoList() {
        return this.productVersionInfoList;
    }

    public AddEnvironmentProductVersionsRequest setProductVersionUIDList(java.util.List<String> productVersionUIDList) {
        this.productVersionUIDList = productVersionUIDList;
        return this;
    }
    public java.util.List<String> getProductVersionUIDList() {
        return this.productVersionUIDList;
    }

    public static class AddEnvironmentProductVersionsRequestProductVersionInfoList extends TeaModel {
        @NameInMap("namespace")
        public String namespace;

        @NameInMap("productVersionUID")
        public String productVersionUID;

        @NameInMap("specUID")
        public String specUID;

        public static AddEnvironmentProductVersionsRequestProductVersionInfoList build(java.util.Map<String, ?> map) throws Exception {
            AddEnvironmentProductVersionsRequestProductVersionInfoList self = new AddEnvironmentProductVersionsRequestProductVersionInfoList();
            return TeaModel.build(map, self);
        }

        public AddEnvironmentProductVersionsRequestProductVersionInfoList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public AddEnvironmentProductVersionsRequestProductVersionInfoList setProductVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        public AddEnvironmentProductVersionsRequestProductVersionInfoList setSpecUID(String specUID) {
            this.specUID = specUID;
            return this;
        }
        public String getSpecUID() {
            return this.specUID;
        }

    }

}
