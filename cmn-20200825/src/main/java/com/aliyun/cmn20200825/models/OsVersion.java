// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class OsVersion extends TeaModel {
    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 厂商
    @NameInMap("Vendor")
    public String vendor;

    // 型号
    @NameInMap("Model")
    public String model;

    // 版本
    @NameInMap("OsVersion")
    public String osVersion;

    // 状态
    @NameInMap("Status")
    public String status;

    // file
    @NameInMap("FileName")
    public String fileName;

    // 文件路径
    @NameInMap("FilePath")
    public String filePath;

    // 资源id
    @NameInMap("OsVersionId")
    public String osVersionId;

    // 用户名
    @NameInMap("AccessId")
    public String accessId;

    // 策略
    @NameInMap("Policy")
    public String policy;

    // 签名
    @NameInMap("Signature")
    public String signature;

    // 目录
    @NameInMap("Directory")
    public String directory;

    // 主机
    @NameInMap("Host")
    public String host;

    // 过期时间
    @NameInMap("ExpireTime")
    public String expireTime;

    public static OsVersion build(java.util.Map<String, ?> map) throws Exception {
        OsVersion self = new OsVersion();
        return TeaModel.build(map, self);
    }

    public OsVersion setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public OsVersion setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
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

    public OsVersion setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
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

    public OsVersion setOsVersionId(String osVersionId) {
        this.osVersionId = osVersionId;
        return this;
    }
    public String getOsVersionId() {
        return this.osVersionId;
    }

    public OsVersion setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
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

    public OsVersion setDirectory(String directory) {
        this.directory = directory;
        return this;
    }
    public String getDirectory() {
        return this.directory;
    }

    public OsVersion setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public OsVersion setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

}
