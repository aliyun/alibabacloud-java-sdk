// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetUploadCredentialsRequest extends TeaModel {
    /**
     * <p>The file name to upload.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>template.yaml</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>Specifies whether the file is publicly accessible. Valid values: <strong>public</strong> or <strong>private</strong>. The default value is <strong>private</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    public static GetUploadCredentialsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUploadCredentialsRequest self = new GetUploadCredentialsRequest();
        return TeaModel.build(map, self);
    }

    public GetUploadCredentialsRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetUploadCredentialsRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

}
