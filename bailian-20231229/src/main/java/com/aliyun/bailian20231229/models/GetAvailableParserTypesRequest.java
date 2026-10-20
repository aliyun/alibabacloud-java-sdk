// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetAvailableParserTypesRequest extends TeaModel {
    /**
     * <p>The file type (extension) for which to retrieve supported parsers. Valid values: </p>
     * <ul>
     * <li>doc</li>
     * <li>docx</li>
     * <li>ppt</li>
     * <li>pptx</li>
     * <li>xls</li>
     * <li>xlsx</li>
     * <li>md</li>
     * <li>txt</li>
     * <li>pdf</li>
     * <li>png</li>
     * <li>jpg</li>
     * <li>jpeg</li>
     * <li>bmp</li>
     * <li>gif</li>
     * <li>html</li>
     * </ul>
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
