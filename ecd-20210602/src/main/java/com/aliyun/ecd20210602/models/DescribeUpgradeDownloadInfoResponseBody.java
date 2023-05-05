// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DescribeUpgradeDownloadInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeUpgradeDownloadInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUpgradeDownloadInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpgradeDownloadInfoResponseBody self = new DescribeUpgradeDownloadInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUpgradeDownloadInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeUpgradeDownloadInfoResponseBody setData(DescribeUpgradeDownloadInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeUpgradeDownloadInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeUpgradeDownloadInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeUpgradeDownloadInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUpgradeDownloadInfoResponseBodyDataDownloadInfo extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("File")
        public String file;

        @NameInMap("RealFileName")
        public String realFileName;

        @NameInMap("SecurityToken")
        public String securityToken;

        public static DescribeUpgradeDownloadInfoResponseBodyDataDownloadInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpgradeDownloadInfoResponseBodyDataDownloadInfo self = new DescribeUpgradeDownloadInfoResponseBodyDataDownloadInfo();
            return TeaModel.build(map, self);
        }

        public DescribeUpgradeDownloadInfoResponseBodyDataDownloadInfo setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public DescribeUpgradeDownloadInfoResponseBodyDataDownloadInfo setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public DescribeUpgradeDownloadInfoResponseBodyDataDownloadInfo setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribeUpgradeDownloadInfoResponseBodyDataDownloadInfo setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public DescribeUpgradeDownloadInfoResponseBodyDataDownloadInfo setFile(String file) {
            this.file = file;
            return this;
        }
        public String getFile() {
            return this.file;
        }

        public DescribeUpgradeDownloadInfoResponseBodyDataDownloadInfo setRealFileName(String realFileName) {
            this.realFileName = realFileName;
            return this;
        }
        public String getRealFileName() {
            return this.realFileName;
        }

        public DescribeUpgradeDownloadInfoResponseBodyDataDownloadInfo setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

    public static class DescribeUpgradeDownloadInfoResponseBodyData extends TeaModel {
        @NameInMap("Comments")
        public String comments;

        @NameInMap("DownloadInfo")
        public DescribeUpgradeDownloadInfoResponseBodyDataDownloadInfo downloadInfo;

        @NameInMap("ForceUpgrade")
        public Boolean forceUpgrade;

        @NameInMap("Size")
        public String size;

        @NameInMap("Version")
        public String version;

        public static DescribeUpgradeDownloadInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpgradeDownloadInfoResponseBodyData self = new DescribeUpgradeDownloadInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeUpgradeDownloadInfoResponseBodyData setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public DescribeUpgradeDownloadInfoResponseBodyData setDownloadInfo(DescribeUpgradeDownloadInfoResponseBodyDataDownloadInfo downloadInfo) {
            this.downloadInfo = downloadInfo;
            return this;
        }
        public DescribeUpgradeDownloadInfoResponseBodyDataDownloadInfo getDownloadInfo() {
            return this.downloadInfo;
        }

        public DescribeUpgradeDownloadInfoResponseBodyData setForceUpgrade(Boolean forceUpgrade) {
            this.forceUpgrade = forceUpgrade;
            return this;
        }
        public Boolean getForceUpgrade() {
            return this.forceUpgrade;
        }

        public DescribeUpgradeDownloadInfoResponseBodyData setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public DescribeUpgradeDownloadInfoResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
