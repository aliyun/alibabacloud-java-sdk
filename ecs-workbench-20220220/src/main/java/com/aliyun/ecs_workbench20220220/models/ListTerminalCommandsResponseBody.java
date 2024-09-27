// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs_workbench20220220.models;

import com.aliyun.tea.*;

public class ListTerminalCommandsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TerminalCommandList")
    public java.util.List<ListTerminalCommandsResponseBodyTerminalCommandList> terminalCommandList;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTerminalCommandsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTerminalCommandsResponseBody self = new ListTerminalCommandsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTerminalCommandsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTerminalCommandsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTerminalCommandsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTerminalCommandsResponseBody setTerminalCommandList(java.util.List<ListTerminalCommandsResponseBodyTerminalCommandList> terminalCommandList) {
        this.terminalCommandList = terminalCommandList;
        return this;
    }
    public java.util.List<ListTerminalCommandsResponseBodyTerminalCommandList> getTerminalCommandList() {
        return this.terminalCommandList;
    }

    public ListTerminalCommandsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTerminalCommandsResponseBodyTerminalCommandList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ls</p>
         */
        @NameInMap("CommandLine")
        public String commandLine;

        /**
         * <strong>example:</strong>
         * <p>2024-04-16T03:53:18Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>/root</p>
         */
        @NameInMap("ExecutePath")
        public String executePath;

        /**
         * <strong>example:</strong>
         * <p>root</p>
         */
        @NameInMap("LoginUser")
        public String loginUser;

        public static ListTerminalCommandsResponseBodyTerminalCommandList build(java.util.Map<String, ?> map) throws Exception {
            ListTerminalCommandsResponseBodyTerminalCommandList self = new ListTerminalCommandsResponseBodyTerminalCommandList();
            return TeaModel.build(map, self);
        }

        public ListTerminalCommandsResponseBodyTerminalCommandList setCommandLine(String commandLine) {
            this.commandLine = commandLine;
            return this;
        }
        public String getCommandLine() {
            return this.commandLine;
        }

        public ListTerminalCommandsResponseBodyTerminalCommandList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTerminalCommandsResponseBodyTerminalCommandList setExecutePath(String executePath) {
            this.executePath = executePath;
            return this;
        }
        public String getExecutePath() {
            return this.executePath;
        }

        public ListTerminalCommandsResponseBodyTerminalCommandList setLoginUser(String loginUser) {
            this.loginUser = loginUser;
            return this;
        }
        public String getLoginUser() {
            return this.loginUser;
        }

    }

}
