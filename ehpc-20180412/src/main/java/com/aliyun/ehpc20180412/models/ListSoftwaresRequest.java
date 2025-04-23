// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListSoftwaresRequest extends TeaModel {
    /**
     * <p>The version of the E-HPC client.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87223.html">ListCurrentClientVersion</a> operation to query the E-HPC client version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("EhpcVersion")
    public String ehpcVersion;

    /**
     * <p>The image tag of the cluster.</p>
     * <p>You can use the <a href="https://help.aliyun.com/document_detail/87213.html">ListImages</a> to query the image tag of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>CentOS_7.2_64</p>
     */
    @NameInMap("OsTag")
    public String osTag;

    public static ListSoftwaresRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSoftwaresRequest self = new ListSoftwaresRequest();
        return TeaModel.build(map, self);
    }

    public ListSoftwaresRequest setEhpcVersion(String ehpcVersion) {
        this.ehpcVersion = ehpcVersion;
        return this;
    }
    public String getEhpcVersion() {
        return this.ehpcVersion;
    }

    public ListSoftwaresRequest setOsTag(String osTag) {
        this.osTag = osTag;
        return this;
    }
    public String getOsTag() {
        return this.osTag;
    }

}
