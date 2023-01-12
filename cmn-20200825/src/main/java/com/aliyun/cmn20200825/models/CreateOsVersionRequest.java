// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateOsVersionRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>代表创建时间的资源属性字段</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>文件名</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>文件路径</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>型号</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>系统版本</p>
     */
    @NameInMap("OsVersion")
    public String osVersion;

    /**
     * <p>状态</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>厂商</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    public static CreateOsVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOsVersionRequest self = new CreateOsVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateOsVersionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateOsVersionRequest setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CreateOsVersionRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateOsVersionRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public CreateOsVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateOsVersionRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CreateOsVersionRequest setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }
    public String getOsVersion() {
        return this.osVersion;
    }

    public CreateOsVersionRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateOsVersionRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
