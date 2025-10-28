// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateSlsLogStoreRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af58edcf-f7eb-<strong><strong>-</strong></strong>-db4e425f****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The configurations of the Logstore.</p>
     * <ul>
     * <li><p>The following parameters are included in the configurations:****</p>
     * <ul>
     * <li><p><strong>type</strong>: the collection type. Set this parameter to file to specify the file type. Set this parameter to stdout to specify the standard output type.</p>
     * </li>
     * <li><p><strong>logstore</strong>: the name of the Logstore. Make sure that the name of the Logstore is unique in the cluster. The name must comply with the following rules:</p>
     * <ul>
     * <li>The name can contain only lowercase letters, digits, hyphens (-), and underscores (_).</li>
     * <li>The name must start and end with a lowercase letter or a digit.</li>
     * <li>The name must be 3 to 63 characters in length.</li>
     * </ul>
     * <p>**</p>
     * <p><strong>Note</strong>If you leave this parameter empty, the system automatically generates a name.</p>
     * </li>
     * <li><p><strong>LogDir</strong>: If the standard output type is used, the collection path is stdout.log. If the file type is used, the collection path is the path of the collected file. Wildcards (\*) are supported. The collection path must match the following regular expression: <code>^/(.+)/(.*)^/$</code>.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;logstore&quot;:&quot;thisisanotherfilelog&quot;,&quot;type&quot;:&quot;file&quot;,&quot;logDir&quot;:&quot;/var/log/<em>&quot;},{&quot;logstore&quot;:&quot;&quot;,&quot;type&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;stdout.log&quot;},{&quot;logstore&quot;:&quot;thisisafilelog&quot;,&quot;type&quot;:&quot;file&quot;,&quot;logDir&quot;:&quot;/tmp/log/</em>&quot;}]</p>
     */
    @NameInMap("Configs")
    public String configs;

    public static UpdateSlsLogStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSlsLogStoreRequest self = new UpdateSlsLogStoreRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSlsLogStoreRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateSlsLogStoreRequest setConfigs(String configs) {
        this.configs = configs;
        return this;
    }
    public String getConfigs() {
        return this.configs;
    }

}
