// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFrontVulPatchListResponseBody extends TeaModel {
    // Details about patches of one or more vulnerabilities before you fix the current vulnerability.
    @NameInMap("FrontPatchList")
    public java.util.List<DescribeFrontVulPatchListResponseBodyFrontPatchList> frontPatchList;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFrontVulPatchListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFrontVulPatchListResponseBody self = new DescribeFrontVulPatchListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFrontVulPatchListResponseBody setFrontPatchList(java.util.List<DescribeFrontVulPatchListResponseBodyFrontPatchList> frontPatchList) {
        this.frontPatchList = frontPatchList;
        return this;
    }
    public java.util.List<DescribeFrontVulPatchListResponseBodyFrontPatchList> getFrontPatchList() {
        return this.frontPatchList;
    }

    public DescribeFrontVulPatchListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList extends TeaModel {
        // The alias of the vulnerability.
        @NameInMap("AliasName")
        public String aliasName;

        // The name of the vulnerability.
        @NameInMap("Name")
        public String name;

        public static DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList self = new DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList();
            return TeaModel.build(map, self);
        }

        public DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeFrontVulPatchListResponseBodyFrontPatchList extends TeaModel {
        // The ID of the cloud desktop.
        @NameInMap("DesktopId")
        public String desktopId;

        // Details about patches.
        @NameInMap("PatchList")
        public java.util.List<DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList> patchList;

        public static DescribeFrontVulPatchListResponseBodyFrontPatchList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFrontVulPatchListResponseBodyFrontPatchList self = new DescribeFrontVulPatchListResponseBodyFrontPatchList();
            return TeaModel.build(map, self);
        }

        public DescribeFrontVulPatchListResponseBodyFrontPatchList setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeFrontVulPatchListResponseBodyFrontPatchList setPatchList(java.util.List<DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList> patchList) {
            this.patchList = patchList;
            return this;
        }
        public java.util.List<DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList> getPatchList() {
            return this.patchList;
        }

    }

}
