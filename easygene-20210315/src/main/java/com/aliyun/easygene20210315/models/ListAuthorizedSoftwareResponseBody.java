// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ListAuthorizedSoftwareResponseBody extends TeaModel {
    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpCode")
    public Integer httpCode;

    // 错误码
    @NameInMap("Code")
    public String code;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 是否调用成功
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    // 翻页TOKEN
    @NameInMap("NextToken")
    public String nextToken;

    // 分页数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 总记录数
    @NameInMap("TotalCount")
    public Integer totalCount;

    // 软件信息
    @NameInMap("Softwares")
    public java.util.List<ListAuthorizedSoftwareResponseBodySoftwares> softwares;

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

    public ListAuthorizedSoftwareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthorizedSoftwareResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListAuthorizedSoftwareResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAuthorizedSoftwareResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAuthorizedSoftwareResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAuthorizedSoftwareResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListAuthorizedSoftwareResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListAuthorizedSoftwareResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAuthorizedSoftwareResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAuthorizedSoftwareResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListAuthorizedSoftwareResponseBody setSoftwares(java.util.List<ListAuthorizedSoftwareResponseBodySoftwares> softwares) {
        this.softwares = softwares;
        return this;
    }
    public java.util.List<ListAuthorizedSoftwareResponseBodySoftwares> getSoftwares() {
        return this.softwares;
    }

    public static class ListAuthorizedSoftwareResponseBodySoftwares extends TeaModel {
        // 软件名称
        @NameInMap("SoftwareName")
        public String softwareName;

        // 软件长名称
        @NameInMap("SoftwareLongName")
        public String softwareLongName;

        // 软件描述
        @NameInMap("SoftwareDescription")
        public String softwareDescription;

        // 软件默认版本
        @NameInMap("SoftwareDefaultVersion")
        public String softwareDefaultVersion;

        // 软件所有版本
        @NameInMap("SoftwareVersions")
        public java.util.List<String> softwareVersions;

        // 软件使用费用
        @NameInMap("SoftwareLicenseFee")
        public Float softwareLicenseFee;

        // 软件可用区域
        @NameInMap("RegionIds")
        public java.util.List<String> regionIds;

        // 帮助链接
        @NameInMap("HelpLink")
        public String helpLink;

        // 软件图标链接
        @NameInMap("SoftwareIcon")
        public String softwareIcon;

        // 最后更新时间
        @NameInMap("LastModified")
        public String lastModified;

        public static ListAuthorizedSoftwareResponseBodySoftwares build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedSoftwareResponseBodySoftwares self = new ListAuthorizedSoftwareResponseBodySoftwares();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setSoftwareName(String softwareName) {
            this.softwareName = softwareName;
            return this;
        }
        public String getSoftwareName() {
            return this.softwareName;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setSoftwareLongName(String softwareLongName) {
            this.softwareLongName = softwareLongName;
            return this;
        }
        public String getSoftwareLongName() {
            return this.softwareLongName;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setSoftwareDescription(String softwareDescription) {
            this.softwareDescription = softwareDescription;
            return this;
        }
        public String getSoftwareDescription() {
            return this.softwareDescription;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setSoftwareDefaultVersion(String softwareDefaultVersion) {
            this.softwareDefaultVersion = softwareDefaultVersion;
            return this;
        }
        public String getSoftwareDefaultVersion() {
            return this.softwareDefaultVersion;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setSoftwareVersions(java.util.List<String> softwareVersions) {
            this.softwareVersions = softwareVersions;
            return this;
        }
        public java.util.List<String> getSoftwareVersions() {
            return this.softwareVersions;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setSoftwareLicenseFee(Float softwareLicenseFee) {
            this.softwareLicenseFee = softwareLicenseFee;
            return this;
        }
        public Float getSoftwareLicenseFee() {
            return this.softwareLicenseFee;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setRegionIds(java.util.List<String> regionIds) {
            this.regionIds = regionIds;
            return this;
        }
        public java.util.List<String> getRegionIds() {
            return this.regionIds;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setHelpLink(String helpLink) {
            this.helpLink = helpLink;
            return this;
        }
        public String getHelpLink() {
            return this.helpLink;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setSoftwareIcon(String softwareIcon) {
            this.softwareIcon = softwareIcon;
            return this;
        }
        public String getSoftwareIcon() {
            return this.softwareIcon;
        }

        public ListAuthorizedSoftwareResponseBodySoftwares setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

    }

}
