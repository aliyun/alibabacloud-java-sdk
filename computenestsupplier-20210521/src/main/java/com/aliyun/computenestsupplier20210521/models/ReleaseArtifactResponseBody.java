// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ReleaseArtifactResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>artifact-9feded91880e4c78xxxx</p>
     */
    @NameInMap("ArtifactId")
    public String artifactId;

    /**
     * <strong>example:</strong>
     * <p>&quot;{\&quot;Url\&quot;:\&quot;<a href="https://computenest-artifacts-draft-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/130920852836xxxx/cn-hangzhou/service-8072a04e5a134382xxxx/165095355xxxx/changes.txt%5C%5C%22,%5C%5C%22ConfigurationMetadata%5C%5C%22:%5C%5C%22%7B%5C%5C%5C%5C%5C%5C%22WorkDir%5C%5C%5C%5C%5C%5C%22:%5C%5C%5C%5C%5C%5C%22/root%5C%5C%5C%5C%5C%5C%22,%5C%5C%5C%5C%5C%5C%22Platform%5C%5C%5C%5C%5C%5C%22:%5C%5C%5C%5C%5C%5C%22Linux%5C%5C%5C%5C%5C%5C%22,%5C%5C%5C%5C%5C%5C%22CommandType%5C%5C%5C%5C%5C%5C%22:%5C%5C%5C%5C%5C%5C%22RunShellScript%5C%5C%5C%5C%5C%5C%22,%5C%5C%5C%5C%5C%5C%22UpgradeScript%5C%5C%5C%5C%5C%5C%22:%5C%5C%5C%5C%5C%5C%22cd">https://computenest-artifacts-draft-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/130920852836xxxx/cn-hangzhou/service-8072a04e5a134382xxxx/165095355xxxx/changes.txt\\&quot;,\\&quot;ConfigurationMetadata\\&quot;:\\&quot;{\\\\\\&quot;WorkDir\\\\\\&quot;:\\\\\\&quot;/root\\\\\\&quot;,\\\\\\&quot;Platform\\\\\\&quot;:\\\\\\&quot;Linux\\\\\\&quot;,\\\\\\&quot;CommandType\\\\\\&quot;:\\\\\\&quot;RunShellScript\\\\\\&quot;,\\\\\\&quot;UpgradeScript\\\\\\&quot;:\\\\\\&quot;cd</a> /root\\\\ncp changes.txt cpchanges.txt\\\\nmv changes.txt mvchangge.txt\\\&quot;}\&quot;}&quot;</p>
     */
    @NameInMap("ArtifactProperty")
    public String artifactProperty;

    /**
     * <strong>example:</strong>
     * <p>File</p>
     */
    @NameInMap("ArtifactType")
    public String artifactType;

    /**
     * <strong>example:</strong>
     * <p>draft</p>
     */
    @NameInMap("ArtifactVersion")
    public String artifactVersion;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>1650954178000</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>3818BA7D-3F50-1A44-9FF3-04A52A59XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Created</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("VersionName")
    public String versionName;

    public static ReleaseArtifactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseArtifactResponseBody self = new ReleaseArtifactResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseArtifactResponseBody setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public String getArtifactId() {
        return this.artifactId;
    }

    public ReleaseArtifactResponseBody setArtifactProperty(String artifactProperty) {
        this.artifactProperty = artifactProperty;
        return this;
    }
    public String getArtifactProperty() {
        return this.artifactProperty;
    }

    public ReleaseArtifactResponseBody setArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }
    public String getArtifactType() {
        return this.artifactType;
    }

    public ReleaseArtifactResponseBody setArtifactVersion(String artifactVersion) {
        this.artifactVersion = artifactVersion;
        return this;
    }
    public String getArtifactVersion() {
        return this.artifactVersion;
    }

    public ReleaseArtifactResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ReleaseArtifactResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ReleaseArtifactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReleaseArtifactResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ReleaseArtifactResponseBody setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
