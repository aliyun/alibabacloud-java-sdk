// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeBucketsRequest extends TeaModel {
    /**
     * <p>The type of the OSS file.</p>
     * <blockquote>
     * <p>This parameter is not yet available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>docx</p>
     */
    @NameInMap("FileType")
    public String fileType;

    public static DescribeBucketsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBucketsRequest self = new DescribeBucketsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBucketsRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
