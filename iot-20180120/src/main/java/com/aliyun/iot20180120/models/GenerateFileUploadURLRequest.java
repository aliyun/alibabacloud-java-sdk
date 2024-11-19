// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GenerateFileUploadURLRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DEVICE_JOB_FILE</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <strong>example:</strong>
     * <p>file1</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bin</p>
     */
    @NameInMap("FileSuffix")
    public String fileSuffix;

    /**
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static GenerateFileUploadURLRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateFileUploadURLRequest self = new GenerateFileUploadURLRequest();
        return TeaModel.build(map, self);
    }

    public GenerateFileUploadURLRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public GenerateFileUploadURLRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GenerateFileUploadURLRequest setFileSuffix(String fileSuffix) {
        this.fileSuffix = fileSuffix;
        return this;
    }
    public String getFileSuffix() {
        return this.fileSuffix;
    }

    public GenerateFileUploadURLRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
