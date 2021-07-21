// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListProductVersionsRequest extends TeaModel {
    @NameInMap("released")
    public Boolean released;

    @NameInMap("platforms")
    public java.util.List<ListProductVersionsRequestPlatforms> platforms;

    @NameInMap("pageNum")
    public String pageNum;

    @NameInMap("pageSize")
    public String pageSize;

    public static ListProductVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionsRequest self = new ListProductVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductVersionsRequest setReleased(Boolean released) {
        this.released = released;
        return this;
    }
    public Boolean getReleased() {
        return this.released;
    }

    public ListProductVersionsRequest setPlatforms(java.util.List<ListProductVersionsRequestPlatforms> platforms) {
        this.platforms = platforms;
        return this;
    }
    public java.util.List<ListProductVersionsRequestPlatforms> getPlatforms() {
        return this.platforms;
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

}
