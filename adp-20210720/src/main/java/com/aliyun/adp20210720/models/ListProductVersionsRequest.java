// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductVersionsRequest extends TeaModel {
    @NameInMap("fuzzy")
    public String fuzzy;

    @NameInMap("pageNum")
    public String pageNum;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("platforms")
    public java.util.List<ListProductVersionsRequestPlatforms> platforms;

    @NameInMap("productName")
    public String productName;

    @NameInMap("productUID")
    public String productUID;

    @NameInMap("released")
    public Boolean released;

    @NameInMap("supportedFoundationTypes")
    public java.util.List<String> supportedFoundationTypes;

    @NameInMap("tag")
    public ListProductVersionsRequestTag tag;

    @NameInMap("version")
    public String version;

    public static ListProductVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionsRequest self = new ListProductVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductVersionsRequest setFuzzy(String fuzzy) {
        this.fuzzy = fuzzy;
        return this;
    }
    public String getFuzzy() {
        return this.fuzzy;
    }

    public ListProductVersionsRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public ListProductVersionsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListProductVersionsRequest setPlatforms(java.util.List<ListProductVersionsRequestPlatforms> platforms) {
        this.platforms = platforms;
        return this;
    }
    public java.util.List<ListProductVersionsRequestPlatforms> getPlatforms() {
        return this.platforms;
    }

    public ListProductVersionsRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public ListProductVersionsRequest setProductUID(String productUID) {
        this.productUID = productUID;
        return this;
    }
    public String getProductUID() {
        return this.productUID;
    }

    public ListProductVersionsRequest setReleased(Boolean released) {
        this.released = released;
        return this;
    }
    public Boolean getReleased() {
        return this.released;
    }

    public ListProductVersionsRequest setSupportedFoundationTypes(java.util.List<String> supportedFoundationTypes) {
        this.supportedFoundationTypes = supportedFoundationTypes;
        return this;
    }
    public java.util.List<String> getSupportedFoundationTypes() {
        return this.supportedFoundationTypes;
    }

    public ListProductVersionsRequest setTag(ListProductVersionsRequestTag tag) {
        this.tag = tag;
        return this;
    }
    public ListProductVersionsRequestTag getTag() {
        return this.tag;
    }

    public ListProductVersionsRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class ListProductVersionsRequestPlatforms extends TeaModel {
        @NameInMap("architecture")
        public String architecture;

        @NameInMap("os")
        public String os;

        public static ListProductVersionsRequestPlatforms build(java.util.Map<String, ?> map) throws Exception {
            ListProductVersionsRequestPlatforms self = new ListProductVersionsRequestPlatforms();
            return TeaModel.build(map, self);
        }

        public ListProductVersionsRequestPlatforms setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public ListProductVersionsRequestPlatforms setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

    }

    public static class ListProductVersionsRequestTag extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static ListProductVersionsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListProductVersionsRequestTag self = new ListProductVersionsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListProductVersionsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListProductVersionsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
