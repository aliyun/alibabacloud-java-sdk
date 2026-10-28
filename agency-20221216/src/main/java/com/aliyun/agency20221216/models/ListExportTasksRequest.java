// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ListExportTasksRequest extends TeaModel {
    /**
     * <p>The ID of the export task.</p>
     * 
     * <strong>example:</strong>
     * <p>12343</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language. Valid values:</p>
     * <ul>
     * <li>en: English.</li>
     * <li>zh: Chinese.</li>
     * <li>ja: Japanese.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The current page number. Pages start from 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Maximum value: 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The export scenario code. Valid values:</p>
     * <ul>
     * <li>intlCustomerQuotaRecord: Customer management, quota transaction export.</li>
     * <li>intlExportUsageDeductHistory: Customer management, deduction detail export.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>intlExportUsageDeductHistory</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    public static ListExportTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExportTasksRequest self = new ListExportTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListExportTasksRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListExportTasksRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListExportTasksRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListExportTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListExportTasksRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
