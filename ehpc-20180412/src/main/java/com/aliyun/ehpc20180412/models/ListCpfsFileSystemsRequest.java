// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCpfsFileSystemsRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     * <br>
     * <p>By default, the information about all CPFSs and their mount targets within your account are queried.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The page number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 50.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListCpfsFileSystemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCpfsFileSystemsRequest self = new ListCpfsFileSystemsRequest();
        return TeaModel.build(map, self);
    }

    public ListCpfsFileSystemsRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ListCpfsFileSystemsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCpfsFileSystemsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
