// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CreateImageCacheRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    public String securityGroupId;

    @NameInMap("VSwitchId")
    @Validation(required = true)
    public String vSwitchId;

    @NameInMap("ImageCacheName")
    @Validation(required = true)
    public String imageCacheName;

    @NameInMap("ImageRegistryCredential")
    public java.util.List<CreateImageCacheRequestImageRegistryCredential> imageRegistryCredential;

    @NameInMap("EipInstanceId")
    public String eipInstanceId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Image")
    @Validation(required = true)
    public java.util.List<String> image;

    @NameInMap("ImageCacheSize")
    public Integer imageCacheSize;

    @NameInMap("RetentionDays")
    public Integer retentionDays;

    public static CreateImageCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageCacheRequest self = new CreateImageCacheRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateImageCacheRequestImageRegistryCredential extends TeaModel {
        @NameInMap("Server")
        @Validation(required = true)
        public String server;

        @NameInMap("UserName")
        @Validation(required = true)
        public String userName;

        @NameInMap("Password")
        @Validation(required = true)
        public String password;

        public static CreateImageCacheRequestImageRegistryCredential build(java.util.Map<String, ?> map) throws Exception {
            CreateImageCacheRequestImageRegistryCredential self = new CreateImageCacheRequestImageRegistryCredential();
            return TeaModel.build(map, self);
        }

    }

}
