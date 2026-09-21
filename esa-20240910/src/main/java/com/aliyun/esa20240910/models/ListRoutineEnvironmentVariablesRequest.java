// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRoutineEnvironmentVariablesRequest extends TeaModel {
    /**
     * <p>The environment name.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><code>production</code>: production environment</li>
     * <li><code>staging</code>: staging environment</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>production</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>The keyword used to perform a case-insensitive fuzzy search on environment variable keys.</p>
     * 
     * <strong>example:</strong>
     * <p>LOG</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>The function name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_routine</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static ListRoutineEnvironmentVariablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRoutineEnvironmentVariablesRequest self = new ListRoutineEnvironmentVariablesRequest();
        return TeaModel.build(map, self);
    }

    public ListRoutineEnvironmentVariablesRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ListRoutineEnvironmentVariablesRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public ListRoutineEnvironmentVariablesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListRoutineEnvironmentVariablesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListRoutineEnvironmentVariablesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
