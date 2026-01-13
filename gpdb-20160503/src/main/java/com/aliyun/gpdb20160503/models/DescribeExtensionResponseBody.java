// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeExtensionResponseBody extends TeaModel {
    /**
     * <p>The current version.</p>
     * 
     * <strong>example:</strong>
     * <p>2.1</p>
     */
    @NameInMap("CurrentVersion")
    public String currentVersion;

    /**
     * <p>The description of the extension.</p>
     * 
     * <strong>example:</strong>
     * <p>zhparser</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The extension ID.</p>
     * 
     * <strong>example:</strong>
     * <p>37</p>
     */
    @NameInMap("ExtensionId")
    public String extensionId;

    /**
     * <p>The extension name.</p>
     * 
     * <strong>example:</strong>
     * <p>zhparser</p>
     */
    @NameInMap("ExtensionName")
    public String extensionName;

    /**
     * <p>Indicates whether an instance restart is required after you install the extension.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("IsInstallNeedRestart")
    public Boolean isInstallNeedRestart;

    /**
     * <p>Whether it is the latest version extension.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("IsLatestVersion")
    public Boolean isLatestVersion;

    /**
     * <p>The latest version.</p>
     * 
     * <strong>example:</strong>
     * <p>2.1</p>
     */
    @NameInMap("LatestVersion")
    public String latestVersion;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the extension.</p>
     * 
     * <strong>example:</strong>
     * <p>installed</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeExtensionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExtensionResponseBody self = new DescribeExtensionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExtensionResponseBody setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }
    public String getCurrentVersion() {
        return this.currentVersion;
    }

    public DescribeExtensionResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeExtensionResponseBody setExtensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
    public String getExtensionId() {
        return this.extensionId;
    }

    public DescribeExtensionResponseBody setExtensionName(String extensionName) {
        this.extensionName = extensionName;
        return this;
    }
    public String getExtensionName() {
        return this.extensionName;
    }

    public DescribeExtensionResponseBody setIsInstallNeedRestart(Boolean isInstallNeedRestart) {
        this.isInstallNeedRestart = isInstallNeedRestart;
        return this;
    }
    public Boolean getIsInstallNeedRestart() {
        return this.isInstallNeedRestart;
    }

    public DescribeExtensionResponseBody setIsLatestVersion(Boolean isLatestVersion) {
        this.isLatestVersion = isLatestVersion;
        return this;
    }
    public Boolean getIsLatestVersion() {
        return this.isLatestVersion;
    }

    public DescribeExtensionResponseBody setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public String getLatestVersion() {
        return this.latestVersion;
    }

    public DescribeExtensionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExtensionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
