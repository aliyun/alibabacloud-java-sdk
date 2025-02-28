// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeInstanceReleaseResponseBody extends TeaModel {
    @NameInMap("ReleaseInfo")
    public DescribeInstanceReleaseResponseBodyReleaseInfo releaseInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("resultCode")
    public String resultCode;

    @NameInMap("success")
    public Boolean success;

    public static DescribeInstanceReleaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceReleaseResponseBody self = new DescribeInstanceReleaseResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceReleaseResponseBody setReleaseInfo(DescribeInstanceReleaseResponseBodyReleaseInfo releaseInfo) {
        this.releaseInfo = releaseInfo;
        return this;
    }
    public DescribeInstanceReleaseResponseBodyReleaseInfo getReleaseInfo() {
        return this.releaseInfo;
    }

    public DescribeInstanceReleaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceReleaseResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeInstanceReleaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeInstanceReleaseResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeInstanceReleaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeInstanceReleaseResponseBodyReleaseInfo extends TeaModel {
        @NameInMap("ComposeName")
        public String composeName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Image")
        public String image;

        @NameInMap("InsType")
        public String insType;

        @NameInMap("MajorVersion")
        public String majorVersion;

        @NameInMap("MinorVersion")
        public String minorVersion;

        public static DescribeInstanceReleaseResponseBodyReleaseInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceReleaseResponseBodyReleaseInfo self = new DescribeInstanceReleaseResponseBodyReleaseInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceReleaseResponseBodyReleaseInfo setComposeName(String composeName) {
            this.composeName = composeName;
            return this;
        }
        public String getComposeName() {
            return this.composeName;
        }

        public DescribeInstanceReleaseResponseBodyReleaseInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstanceReleaseResponseBodyReleaseInfo setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeInstanceReleaseResponseBodyReleaseInfo setInsType(String insType) {
            this.insType = insType;
            return this;
        }
        public String getInsType() {
            return this.insType;
        }

        public DescribeInstanceReleaseResponseBodyReleaseInfo setMajorVersion(String majorVersion) {
            this.majorVersion = majorVersion;
            return this;
        }
        public String getMajorVersion() {
            return this.majorVersion;
        }

        public DescribeInstanceReleaseResponseBodyReleaseInfo setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

    }

}
