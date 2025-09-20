// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetAvailableParserTypesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pdf</p>
     */
    @NameInMap("FileType")
    public String fileType;

    public static GetAvailableParserTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAvailableParserTypesRequest self = new GetAvailableParserTypesRequest();
        return TeaModel.build(map, self);
    }

    public GetAvailableParserTypesRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
