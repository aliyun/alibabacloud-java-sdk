// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDirQuotasRequest extends TeaModel {
    /**
     * <p>The file system ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1ca404****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The page number.</p>
     * <p>Start value (default value): 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of directories on each page. Default value: 10.</p>
     * <p>Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The absolute path of the directory in the file system.</p>
     * <p>If this parameter is left empty, all directories that have quotas configured in the file system are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>/data/sub1</p>
     */
    @NameInMap("Path")
    public String path;

    public static DescribeDirQuotasRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDirQuotasRequest self = new DescribeDirQuotasRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDirQuotasRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeDirQuotasRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDirQuotasRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDirQuotasRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}
