// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class Code extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>demo-bucket</p>
     */
    @NameInMap("ossBucketName")
    public String ossBucketName;

    /**
     * <strong>example:</strong>
     * <p>demo-key</p>
     */
    @NameInMap("ossObjectName")
    public String ossObjectName;

    /**
     * <strong>example:</strong>
     * <p>UEsDBAoAAAAAANFUiFYAAAAAAAAAAAAAAAAFABwAY29kZS9VVAkAA6rTMGSq0zBk dXgLAAEE9gEAAAQUAAAAUEsDBBQAAAAIANFUiFaigyIV4wEAAM4DAAANABwAY29k ZS9pbmRleC5qc1VUCQADqtMwZKvTMGR1eAsAAQT2AQAABBQAAAB1k81u1DAQx+9+ irnFqVJHHCioq+UAEqIcALXlhBByktmNqWOntrPbgPZF+iy8E6+AvfYmUYFc4vH/ NzOZj+y4gS26a75/rZsR1mDwfhAGaWb4/rzyd1m+IrtIvdWme4oFpNx44cRV/wCC Rkh5Rm41oOKVRHAtglDCCS7FDzSwQe4Gg0Bb53p7WZYtyp55cRwUq3VXNroeOlTu W4OOC1k+e37x8sUFa10nc9JL5NYH7PwhQH+HH1TthFbALVQo9f73r0eCD702zrIl uAZaa+XwwRVQcykrXt/lsH4FPwmAV6yWyKTe0mzyEmobCoSJp2qQsoAs3B5W5Kwk U6qWq0bGNL5DhW+T7QtIGac8TzL5VkgNe21kc+xkAEKre254Z32s6BOenrv2MjSf hVMx3d8PaATaKCVjVlvkDZqkJmNWO3StbiCq0ZjFMGe07vP1VQIGI2e1lsJP4+pT 0k5mBA6xknn9YktOo6JoTHFcp3xRoF81oKH4Oxz9hJf1LLHYoB2XA8ZlPEFfvN/X 1YILE2AW3btj2dTLRfTLZ+pA/kNnb8LklDu/HXvM/Mh530tR8/D95XerVbaIEsfF 0g8SXszpG2f8/tAFllKohr6/+fiB2SMgNiON/gWk7QpslifHQ1g18gdQSwECHgMK AAAAAADRVIhWAAAAAAAAAAAAAAAABQAYAAAAAAAAABAA7UEAAAAAY29kZS9VVAUA A6rTMGR1eAsAAQT2AQAABBQAAABQSwECHgMUAAAACADRVIhWooMiFeMBAADOAwAA DQAYAAAAAAABAAAApIE/AAAAY29kZS9pbmRleC5qc1VUBQADqtMwZHV4CwABBPYB AAAEFAAAAFBLBQYAAAAAAgACAJ4AAABpAgAAAAA=</p>
     */
    @NameInMap("zipFile")
    public String zipFile;

    public static Code build(java.util.Map<String, ?> map) throws Exception {
        Code self = new Code();
        return TeaModel.build(map, self);
    }

    public Code setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public Code setOssObjectName(String ossObjectName) {
        this.ossObjectName = ossObjectName;
        return this;
    }
    public String getOssObjectName() {
        return this.ossObjectName;
    }

    public Code setZipFile(String zipFile) {
        this.zipFile = zipFile;
        return this;
    }
    public String getZipFile() {
        return this.zipFile;
    }

}
