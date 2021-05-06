// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFrontVulPatchListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("FrontPatchList")
    @Validation(required = true)
    public java.util.List<DescribeFrontVulPatchListResponseFrontPatchList> frontPatchList;

    public static DescribeFrontVulPatchListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFrontVulPatchListResponse self = new DescribeFrontVulPatchListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFrontVulPatchListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFrontVulPatchListResponse setFrontPatchList(java.util.List<DescribeFrontVulPatchListResponseFrontPatchList> frontPatchList) {
        this.frontPatchList = frontPatchList;
        return this;
    }
    public java.util.List<DescribeFrontVulPatchListResponseFrontPatchList> getFrontPatchList() {
        return this.frontPatchList;
    }

    public static class DescribeFrontVulPatchListResponseFrontPatchListPatchList extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("AliasName")
        @Validation(required = true)
        public String aliasName;

        public static DescribeFrontVulPatchListResponseFrontPatchListPatchList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFrontVulPatchListResponseFrontPatchListPatchList self = new DescribeFrontVulPatchListResponseFrontPatchListPatchList();
            return TeaModel.build(map, self);
        }

        public DescribeFrontVulPatchListResponseFrontPatchListPatchList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeFrontVulPatchListResponseFrontPatchListPatchList setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

    }

    public static class DescribeFrontVulPatchListResponseFrontPatchList extends TeaModel {
        @NameInMap("DesktopId")
        @Validation(required = true)
        public String desktopId;

        @NameInMap("PatchList")
        @Validation(required = true)
        public java.util.List<DescribeFrontVulPatchListResponseFrontPatchListPatchList> patchList;

        public static DescribeFrontVulPatchListResponseFrontPatchList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFrontVulPatchListResponseFrontPatchList self = new DescribeFrontVulPatchListResponseFrontPatchList();
            return TeaModel.build(map, self);
        }

        public DescribeFrontVulPatchListResponseFrontPatchList setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeFrontVulPatchListResponseFrontPatchList setPatchList(java.util.List<DescribeFrontVulPatchListResponseFrontPatchListPatchList> patchList) {
            this.patchList = patchList;
            return this;
        }
        public java.util.List<DescribeFrontVulPatchListResponseFrontPatchListPatchList> getPatchList() {
            return this.patchList;
        }

    }

}
