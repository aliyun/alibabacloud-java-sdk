// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Row extends TeaModel {
    /**
     * <p>The custom labels.</p>
     */
    @NameInMap("CustomLabels")
    public java.util.List<KeyValuePair> customLabels;

    /**
     * <p>The OSS URI of the file.</p>
     * <p>The OSS URI is in the <code>oss://${bucketname}/${objectname}</code> format, where <code>${bucketname}</code> is the name of the OSS bucket that is in the same region as the current project and <code>${objectname}</code> is the path of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://examplebucket/exampleobject.jpg</p>
     */
    @NameInMap("URI")
    public String URI;

    public static Row build(java.util.Map<String, ?> map) throws Exception {
        Row self = new Row();
        return TeaModel.build(map, self);
    }

    public Row setCustomLabels(java.util.List<KeyValuePair> customLabels) {
        this.customLabels = customLabels;
        return this;
    }
    public java.util.List<KeyValuePair> getCustomLabels() {
        return this.customLabels;
    }

    public Row setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

}
