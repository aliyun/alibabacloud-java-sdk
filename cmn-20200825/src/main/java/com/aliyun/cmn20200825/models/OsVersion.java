// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class OsVersion extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Directory")
    public String directory;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("Host")
    public String host;

    @NameInMap("Model")
    public String model;

    @NameInMap("OsVersion")
    public String osVersion;

    @NameInMap("OsVersionId")
    public String osVersionId;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("Signature")
    public String signature;

    @NameInMap("Status")
    public String status;

    @NameInMap("Vendor")
    public String vendor;

    public static OsVersion build(java.util.Map<String, ?> map) throws Exception {
        OsVersion self = new OsVersion();
        return TeaModel.build(map, self);
    }

    public OsVersion setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public OsVersion setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public OsVersion setDirectory(String directory) {
        this.directory = directory;
        return this;
    }
    public String getDirectory() {
        return this.directory;
    }

    public OsVersion setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public OsVersion setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public OsVersion setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public OsVersion setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public OsVersion setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public OsVersion setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }
    public String getOsVersion() {
        return this.osVersion;
    }

    public OsVersion setOsVersionId(String osVersionId) {
        this.osVersionId = osVersionId;
        return this;
    }
    public String getOsVersionId() {
        return this.osVersionId;
    }

    public OsVersion setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public OsVersion setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public OsVersion setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public OsVersion setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
