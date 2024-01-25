// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListComponentVersionsRequest extends TeaModel {
    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("platforms")
    public java.util.List<ListComponentVersionsRequestPlatforms> platforms;

    @NameInMap("version")
    public String version;

    public static ListComponentVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListComponentVersionsRequest self = new ListComponentVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListComponentVersionsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListComponentVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListComponentVersionsRequest setPlatforms(java.util.List<ListComponentVersionsRequestPlatforms> platforms) {
        this.platforms = platforms;
        return this;
    }
    public java.util.List<ListComponentVersionsRequestPlatforms> getPlatforms() {
        return this.platforms;
    }

    public ListComponentVersionsRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class ListComponentVersionsRequestPlatforms extends TeaModel {
        @NameInMap("architecture")
        public String architecture;

        @NameInMap("os")
        public String os;

        public static ListComponentVersionsRequestPlatforms build(java.util.Map<String, ?> map) throws Exception {
            ListComponentVersionsRequestPlatforms self = new ListComponentVersionsRequestPlatforms();
            return TeaModel.build(map, self);
        }

        public ListComponentVersionsRequestPlatforms setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public ListComponentVersionsRequestPlatforms setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

    }

}
