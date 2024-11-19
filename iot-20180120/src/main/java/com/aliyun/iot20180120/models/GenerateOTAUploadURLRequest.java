// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GenerateOTAUploadURLRequest extends TeaModel {
    /**
     * <p>The file name extension of the update package file. Valid values: bin, dav, apk, tar, gz, tar.gz, zip, and gzip.</p>
     * <p>Default value: bin.</p>
     * 
     * <strong>example:</strong>
     * <p>apk</p>
     */
    @NameInMap("FileSuffix")
    public String fileSuffix;

    /**
     * <p>The ID of the instance. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
     * <li>If no <strong>Overview</strong> page or ID is generated for your instance, you do not need to configure this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static GenerateOTAUploadURLRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateOTAUploadURLRequest self = new GenerateOTAUploadURLRequest();
        return TeaModel.build(map, self);
    }

    public GenerateOTAUploadURLRequest setFileSuffix(String fileSuffix) {
        this.fileSuffix = fileSuffix;
        return this;
    }
    public String getFileSuffix() {
        return this.fileSuffix;
    }

    public GenerateOTAUploadURLRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
