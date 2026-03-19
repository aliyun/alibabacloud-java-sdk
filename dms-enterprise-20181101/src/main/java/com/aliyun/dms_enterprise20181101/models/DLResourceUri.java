// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DLResourceUri extends TeaModel {
    /**
     * <p>The resource type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>ARCHIVE</li>
     * <li>JAR</li>
     * <li>FILE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>JAR</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The URL used to access the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>hdfs://name****.example.com:8020/user/hive/udfs/my_***.jar</p>
     */
    @NameInMap("Uri")
    public String uri;

    public static DLResourceUri build(java.util.Map<String, ?> map) throws Exception {
        DLResourceUri self = new DLResourceUri();
        return TeaModel.build(map, self);
    }

    public DLResourceUri setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DLResourceUri setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

}
