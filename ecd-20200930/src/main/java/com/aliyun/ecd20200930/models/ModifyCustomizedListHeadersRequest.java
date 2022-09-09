// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCustomizedListHeadersRequest extends TeaModel {
    @NameInMap("Headers")
    public java.util.List<ModifyCustomizedListHeadersRequestHeaders> headers;

    @NameInMap("ListType")
    public String listType;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyCustomizedListHeadersRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomizedListHeadersRequest self = new ModifyCustomizedListHeadersRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCustomizedListHeadersRequest setHeaders(java.util.List<ModifyCustomizedListHeadersRequestHeaders> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.List<ModifyCustomizedListHeadersRequestHeaders> getHeaders() {
        return this.headers;
    }

    public ModifyCustomizedListHeadersRequest setListType(String listType) {
        this.listType = listType;
        return this;
    }
    public String getListType() {
        return this.listType;
    }

    public ModifyCustomizedListHeadersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyCustomizedListHeadersRequestHeaders extends TeaModel {
        @NameInMap("DisplayType")
        public String displayType;

        @NameInMap("HeaderKey")
        public String headerKey;

        public static ModifyCustomizedListHeadersRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            ModifyCustomizedListHeadersRequestHeaders self = new ModifyCustomizedListHeadersRequestHeaders();
            return TeaModel.build(map, self);
        }

        public ModifyCustomizedListHeadersRequestHeaders setDisplayType(String displayType) {
            this.displayType = displayType;
            return this;
        }
        public String getDisplayType() {
            return this.displayType;
        }

        public ModifyCustomizedListHeadersRequestHeaders setHeaderKey(String headerKey) {
            this.headerKey = headerKey;
            return this;
        }
        public String getHeaderKey() {
            return this.headerKey;
        }

    }

}
