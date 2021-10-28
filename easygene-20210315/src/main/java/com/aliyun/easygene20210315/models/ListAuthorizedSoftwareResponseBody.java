// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListAuthorizedSoftwareResponseBody extends TeaModel {
    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 分页数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 翻页Token用来表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("NextToken")
    public String nextToken;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 软件信息
    @NameInMap("Softwares")
    public java.util.List<ListAuthorizedSoftwareResponseBodySoftwares> softwares;

    // 总记录数
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAuthorizedSoftwareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedSoftwareResponseBody self = new ListAuthorizedSoftwareResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedSoftwareResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ListAuthorizedSoftwareResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAuthorizedSoftwareResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAuthorizedSoftwareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizedSoftwareResponseBody setSoftwares(java.util.List<ListAuthorizedSoftwareResponseBodySoftwares> softwares) {
        this.softwares = softwares;
        return this;
    }
    public java.util.List<ListAuthorizedSoftwareResponseBodySoftwares> getSoftwares() {
        return this.softwares;
    }

    public ListAuthorizedSoftwareResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAuthorizedSoftwareResponseBodySoftwares extends TeaModel {
        // 帮助链接
        @NameInMap("HelpLink")
        public String helpLink;

        // 最后更新时间
        @NameInMap("LastModified")
        public String lastModified;

        // 软件可用区域
        @NameInMap("Locations")
        public java.util.List<String> locations;

        // 限时免费说明
        @NameInMap("Promotion")
        public String promotion;

        // 软件默认版本
        @NameInMap("SoftwareDefaultVersion")
        public String softwareDefaultVersion;

        // 软件描述
        @NameInMap("SoftwareDescription")
        public String softwareDescription;

        // 软件图标链接
        @NameInMap("SoftwareIcon")
        public String softwareIcon;

        // 软件使用费用
        @NameInMap("SoftwareLicenseFee")
        public Float softwareLicenseFee;

        // 软件长名称
        @NameInMap("SoftwareLongName")
        public String softwareLongName;

        // 软件名称
        @NameInMap("SoftwareName")
        public String softwareName;

        // 软件所有版本
        @NameInMap("SoftwareVersions")
        public java.util.List<String> softwareVersions;

        public static ListAuthorizedSoftwareResponseBodySoftwares build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedSoftwareResponseBodySoftwares self = new ListAuthorizedSoftwareResponseBodySoftwares();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setHelpLink(String helpLink) {
            this.helpLink = helpLink;
            return this;
        }
        public String getHelpLink() {
            return this.helpLink;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setLocations(java.util.List<String> locations) {
            this.locations = locations;
            return this;
        }
        public java.util.List<String> getLocations() {
            return this.locations;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setPromotion(String promotion) {
            this.promotion = promotion;
            return this;
        }
        public String getPromotion() {
            return this.promotion;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setSoftwareDefaultVersion(String softwareDefaultVersion) {
            this.softwareDefaultVersion = softwareDefaultVersion;
            return this;
        }
        public String getSoftwareDefaultVersion() {
            return this.softwareDefaultVersion;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setSoftwareDescription(String softwareDescription) {
            this.softwareDescription = softwareDescription;
            return this;
        }
        public String getSoftwareDescription() {
            return this.softwareDescription;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setSoftwareIcon(String softwareIcon) {
            this.softwareIcon = softwareIcon;
            return this;
        }
        public String getSoftwareIcon() {
            return this.softwareIcon;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setSoftwareLicenseFee(Float softwareLicenseFee) {
            this.softwareLicenseFee = softwareLicenseFee;
            return this;
        }
        public Float getSoftwareLicenseFee() {
            return this.softwareLicenseFee;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setSoftwareLongName(String softwareLongName) {
            this.softwareLongName = softwareLongName;
            return this;
        }
        public String getSoftwareLongName() {
            return this.softwareLongName;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setSoftwareName(String softwareName) {
            this.softwareName = softwareName;
            return this;
        }
        public String getSoftwareName() {
            return this.softwareName;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setSoftwareVersions(java.util.List<String> softwareVersions) {
            this.softwareVersions = softwareVersions;
            return this;
        }
        public java.util.List<String> getSoftwareVersions() {
            return this.softwareVersions;
        }

    }

}
