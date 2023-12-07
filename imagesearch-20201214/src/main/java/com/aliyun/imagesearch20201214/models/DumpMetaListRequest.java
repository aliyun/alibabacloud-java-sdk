// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class DumpMetaListRequest extends TeaModel {
    /**
     * <p>The ID of the export task.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the Image Search instance. The name can be up to 20 characters in length.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of images to return on each page. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DumpMetaListRequest build(java.util.Map<String, ?> map) throws Exception {
        DumpMetaListRequest self = new DumpMetaListRequest();
        return TeaModel.build(map, self);
    }

    public DumpMetaListRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DumpMetaListRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DumpMetaListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DumpMetaListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
