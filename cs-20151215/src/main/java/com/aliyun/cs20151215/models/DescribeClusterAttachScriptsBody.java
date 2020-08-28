// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAttachScriptsBody extends TeaModel {
    @NameInMap("options")
    public DescribeClusterAttachScriptsBodyOptions options;

    public static DescribeClusterAttachScriptsBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAttachScriptsBody self = new DescribeClusterAttachScriptsBody();
        return TeaModel.build(map, self);
    }

    public static class DescribeClusterAttachScriptsBodyOptions extends TeaModel {
        @NameInMap("flannelIface")
        public String flannelIface;

        @NameInMap("enableIptables")
        public Boolean enableIptables;

        @NameInMap("manageRuntime")
        public Boolean manageRuntime;

        @NameInMap("nodeNameStrategy")
        public String nodeNameStrategy;

        @NameInMap("nodeName")
        public String nodeName;

        @NameInMap("nodeNamePrefix")
        public String nodeNamePrefix;

        @NameInMap("enabledAddons")
        public java.util.List<String> enabledAddons;

        public static DescribeClusterAttachScriptsBodyOptions build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterAttachScriptsBodyOptions self = new DescribeClusterAttachScriptsBodyOptions();
            return TeaModel.build(map, self);
        }

    }

}
