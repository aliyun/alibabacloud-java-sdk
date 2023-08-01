// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateSlsLogStoreRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](~~149390~~).</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The configurations of the Logstore.</p>
     * <br>
     * <p>*   The following parameters are included in the configurations:****</p>
     * <br>
     * <p>    *   **type**: the collection type. Set this parameter to file to specify the file type. Set this parameter to stdout to specify the standard output type.</p>
     * <br>
     * <p>    *   **logstore**: the name of the Logstore. Make sure that the name of the Logstore is unique in the cluster. The name must comply with the following rules:</p>
     * <br>
     * <p>        *   The name can contain only lowercase letters, digits, hyphens (-), and underscores (\_).</p>
     * <p>        *   The name must start and end with a lowercase letter or a digit.</p>
     * <p>        *   The name must be 3 to 63 characters in length.</p>
     * <br>
     * <p>        **</p>
     * <br>
     * <p>        **Note**If you leave this parameter empty, the system automatically generates a name.</p>
     * <br>
     * <p>    *   **LogDir**: If the standard output type is used, the collection path is stdout.log. If the file type is used, the collection path is the path of the collected file. Wildcards (\*) are supported. The collection path must match the following regular expression: `^/(.+)/(.*)^/$`.</p>
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
