// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchRetcodeAppByPageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageBean")
    @Validation(required = true)
    public SearchRetcodeAppByPageResponsePageBean pageBean;

    public static SearchRetcodeAppByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchRetcodeAppByPageResponse self = new SearchRetcodeAppByPageResponse();
        return TeaModel.build(map, self);
    }

    public static class SearchRetcodeAppByPageResponsePageBeanRetcodeApps extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
        public Long appId;

        @NameInMap("Pid")
        @Validation(required = true)
        public String pid;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        public static SearchRetcodeAppByPageResponsePageBeanRetcodeApps build(java.util.Map<String, ?> map) throws Exception {
            SearchRetcodeAppByPageResponsePageBeanRetcodeApps self = new SearchRetcodeAppByPageResponsePageBeanRetcodeApps();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchRetcodeAppByPageResponsePageBean extends TeaModel {
        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("RetcodeApps")
        @Validation(required = true)
        public java.util.List<SearchRetcodeAppByPageResponsePageBeanRetcodeApps> retcodeApps;

        public static SearchRetcodeAppByPageResponsePageBean build(java.util.Map<String, ?> map) throws Exception {
            SearchRetcodeAppByPageResponsePageBean self = new SearchRetcodeAppByPageResponsePageBean();
            return TeaModel.build(map, self);
        }

    }

}
